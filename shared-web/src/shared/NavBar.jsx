import React from 'react';
import { useState, useEffect } from 'react';
import { Popup } from '@progress/kendo-react-popup';
import Cookies from 'js-cookie';
import {
  AppBar,
  AppBarSection,
  Card,
  CardBody,
  CardTitle,
  GridLayout,
  GridLayoutItem,
  Avatar
} from '@progress/kendo-react-layout';
import { logoutIcon, userIcon } from '@progress/kendo-svg-icons';
import { SvgIcon } from '@progress/kendo-react-common';
import NavDropdown from 'react-bootstrap/NavDropdown';
import './reports.css';
import { api } from '../api';
import { Button } from '@progress/kendo-react-buttons';
import Dropdown from 'react-bootstrap/Dropdown';
import DropdownButton from 'react-bootstrap/DropdownButton';
import { createSearchParams, Navigate, useNavigate } from 'react-router-dom';
import { NavLink } from 'react-router-dom';

const NavBar = () => {
  const [data, setData] = useState([]);
  const navigate = useNavigate();

  async function fetchUser() {
    const tenantId = Cookies.get('tenantId');
    const userId = Cookies.get('userId');
    try {
      const response = await api.get(
        `reports/userprofile?userid=${userId}&tenent=${tenantId}`
      );
      if (Array.isArray(response.data)) {
        setData(response.data);
      }
    } catch (error) {
      console.log(error);
    }
  }

  useEffect(() => {
    fetchUser();
  }, []);

  return (
    <nav className="navbar">
      <AppBarSection>
        <NavLink
          to={{
            pathname: '/report',
            search: `?${createSearchParams({
              token: Cookies.get('jwt_token')
            })}`
          }}
        >
          <span onClick={() => navigate(`/?${Cookies.get('jwt_token')}`)}>
            <svg
              width="77"
              height="32"
              viewBox="0 0 77 32"
              fill="none"
              xmlns="http://www.w3.org/2000/svg"
              xlink="http://www.w3.org/1999/xlink"
            >
              <rect
                y="0.47522"
                width="76.7479"
                height="30.6994"
                fill="url(#pattern0)"
              />
              <defs>
                <pattern
                  id="pattern0"
                  patternContentUnits="objectBoundingBox"
                  width="1"
                  height="1"
                >
                  <use
                    href="#image0_1295_2376"
                    transform="scale(0.0100001 0.025)"
                  />
                </pattern>
                <image
                  id="image0_1295_2376"
                  width="100"
                  height="40"
                  href="data:image/png;base64,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"
                />
              </defs>
            </svg>
          </span>
        </NavLink>
      </AppBarSection>
      <NavDropdown
        title={
          <Avatar type="text" size="medium" className="nav-avatar">
            {data.length > 0 ? (
              <span className="name-badge">
                {data[0]?.first_name[0] + data[0]?.last_name[0]}
              </span>
            ) : (
              <span className="k-icon k-i-user" />
            )}
          </Avatar>
        }
        id="collasible-nav-dropdown"
      >
        <div className="nav-dropdown-name">
          {data.length > 0 ? data[0]?.user_name : 'User'}
        </div>
        <NavDropdown.Divider />
        <NavDropdown.Item>
          <span className="k-icon k-i-user"></span>
          &nbsp;
          <span>My Profile</span>
        </NavDropdown.Item>
        <NavDropdown.Item>
          <span className="k-icon k-i-logout"></span>
          &nbsp;
          <span>Log Out</span>
        </NavDropdown.Item>
      </NavDropdown>
    </nav>
  );
};
export default NavBar;

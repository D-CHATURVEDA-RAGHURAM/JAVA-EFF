import axios from "axios";
import { EFFIGO_LINK_IPC,  EFFIGO_LINK_PO, EFFIGO_LINK_KBL} from "./environment";

export const apiIPC = axios.create({
  baseURL: EFFIGO_LINK_IPC,
});

export const apiPO = axios.create({
  baseURL: EFFIGO_LINK_PO,
});

export const apiKBL =axios.create({
  baseURL:EFFIGO_LINK_KBL
});

apiIPC.interceptors.request.use(
  function (config) {
    return config;
  },
  function (error) {
    return Promise.reject(error);
  }
);

apiIPC.interceptors.response.use(
  function (response) {
    return response;
  },
  function (error) {
    return Promise.reject(error);
  }
);


apiKBL.interceptors.request.use(
  function (config) {
    return config;
  },
  function (error) {
    return Promise.reject(error);
  }
);

apiKBL.interceptors.response.use(
  function (response) {
    return response;
  },
  function (error) {
    return Promise.reject(error);
  }
);

apiPO.interceptors.request.use(
  function (config) {
    return config;
  },
  function (error) {
    return Promise.reject(error);
  }
);

apiPO.interceptors.response.use(
  function (response) {
    return response;
  },
  function (error) {
    return Promise.reject(error);
  }
);

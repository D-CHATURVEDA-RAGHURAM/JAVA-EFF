//Change Date from ISO to day-month-year
export const formatDateDMY = (isoDate: any) => {
  if (isoDate === 'NA' || isoDate === null) {
    return 'NA';
  } else {
    const date = new Date(isoDate);
    const day = date.getDate().toString().padStart(2, '0');
    const month = (date.getMonth() + 1).toString().padStart(2, '0');
    const year = date.getFullYear();
    const fmtDate = `${day}-${month}-${year}`;
    return fmtDate;
  }
};

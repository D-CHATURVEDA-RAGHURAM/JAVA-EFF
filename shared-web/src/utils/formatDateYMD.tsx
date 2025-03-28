//Change Date Format from ISO to YYYY-MM-DD format
export const formatDateYMD = (IsoDate: any) => {
  const date = new Date(IsoDate);
  const options: Intl.DateTimeFormatOptions = {
    timeZone: 'Asia/Kolkata',
    year: 'numeric',
    month: '2-digit',
    day: '2-digit'
  };
  const formattedDate = date
    .toLocaleDateString('en-IN', options)
    .split('/')
    .join('-');
  const [day, month, year] = formattedDate.split('-');
  const outputDate = `${year}-${month}-${day}`;
  return outputDate;
};

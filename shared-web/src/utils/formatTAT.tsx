//Change the value of Approval TAT from seconds to Day:HR:Min:Sec
export const formatTAT = (tatValue: any) => {
  if (tatValue === 'NA' || tatValue === null || isNaN(tatValue)) {
    return 'NA';
  }
  let seconds = Math.round(tatValue);
  let days = Math.floor(seconds / (3600 * 24));
  let hours = Math.floor((seconds % (3600 * 24)) / 3600);
  return `${days} Day : ${hours} Hr`;
};

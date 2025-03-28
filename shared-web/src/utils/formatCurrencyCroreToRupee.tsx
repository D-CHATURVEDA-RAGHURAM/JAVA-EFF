//Custom cell rendering for currency value Crore to  Rupees
export const formatCurrencyCroreToRupee = (currency: any) => {
  if (currency === 'NA' || currency === null) {
    return 0;
  } else {
    const crore: any = currency * 10000000;
    const inrCurrency = toINR(parseFloat(crore));
    return inrCurrency;
  }
};

//Currency formatter decimal to INR
const toINR = (amt: number) => {
  const amount = Math.floor(amt * 100) / 100;
  const formattedAmount = amount.toLocaleString('en-IN', {
    currency: 'INR'
  });
  return formattedAmount;
};

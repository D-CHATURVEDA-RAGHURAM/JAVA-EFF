// Custom cell rendering for currency value
export const formatCurrency = (currency: any) => {
  if (currency === 'NA' || currency === null) {
    return 0;
  } else {
    const inrCurrency = toINR(parseFloat(currency));
    return inrCurrency;
  }
};

// Currency formatter decimal to INR
const toINR = (amt: number) => {
  const amount = Math.floor(amt * 100) / 100;
  const decimalCount = (amt.toString().split('.')[1] || []).length;

  // Add two zeros if no decimals present
  if (decimalCount === 0) {
    return amount.toLocaleString('en-IN', { currency: 'INR' }) + '.00';
  }

  const formattedAmount: any = amount.toLocaleString('en-IN', {
    currency: 'INR'
  });
  return formattedAmount;
};

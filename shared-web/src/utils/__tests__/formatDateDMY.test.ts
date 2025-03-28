import { formatDateDMY } from '../formatDateDMY';
describe("formatDateDMY",()=>{
  it('When date is ISO return in DD-MM-YYYY format', () => {
    const result: string = formatDateDMY('2023-04-18T07:42:26.926000+00:00');
    expect(result).toBe('18-04-2023');
  });
  
  it('When date is NA return NA', () => {
    const result: string = formatDateDMY('NA');
    expect(result).toBe('NA');
  });
  
  it('When date is Null return NA', () => {
    const result: string = formatDateDMY(null);
    expect(result).toBe('NA');
  });
  
})

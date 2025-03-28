import {formatTAT} from '../formatTAT';

describe("formatTAT",()=>{
    it("When TAT is NA return NA",()=>{
        const result:string = formatTAT('NA');
        expect(result).toBe('NA');
    })
    
    it("When TAT is null return NA",()=>{
        const result:string = formatTAT(null);
        expect(result).toBe('NA');
    })
    
    it("When TAT is not a number return NA",()=>{
        const result:string = formatTAT("abcd");
        expect(result).toBe('NA');
    })
    
    it("When TAT is number in seconds return in D:Hr:Min:sec format",()=>{
        const result:string = formatTAT(156732);
        expect(result).toBe('1 Day : 19 Hr')
    })
    
    it("When TAT is number in seconds with decimal values return in D:Hr:Min:sec format",()=>{
        const result:string = formatTAT(254137.9847);
        expect(result).toBe('2 Day : 22 Hr')
    })
    
    it("When TAT is number in string format with decimal values return in D:Hr:Min:sec format",()=>{
        const result:string = formatTAT("254137.9847");
        expect(result).toBe('2 Day : 22 Hr')
    })
})

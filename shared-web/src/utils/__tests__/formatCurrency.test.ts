import { formatCurrency } from "../formatCurrency";

describe("formatCurrency",()=>{
    it("When currency is a decimal value",()=>{
        const result:string = formatCurrency(141.931);
        expect(result).toBe("141.93");
    })
    
    it("When currency is string along with decimal",()=>{
        const result:string = formatCurrency("141.931");
        expect(result).toBe("141.93");
    })
    
    it("When currency is NA return 0",()=>{
        const result:string = formatCurrency("NA");
        expect(result).toBe(0);
    })
    
    it("When currency is null return 0",()=>{
        const result:string = formatCurrency(null);
        expect(result).toBe(0);
    })
    
    it("When currency is string value with decimal return INR formatted value",()=>{
        const result:string = formatCurrency("25639.4589");
        expect(result).toBe("25,639.45");
    })
    
    it("When currency is decimal float value return INR formatted value",()=>{
        const result:string = formatCurrency(2455354.458922);
        expect(result).toBe("24,55,354.45");
    })

    it("When currency has no decimal  value return INR formatted value with two zeros after decimal",()=>{
        const result:string = formatCurrency(2455354);
        expect(result).toBe("24,55,354.00");
    })
})

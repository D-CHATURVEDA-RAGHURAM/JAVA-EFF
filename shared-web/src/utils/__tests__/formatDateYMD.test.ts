import { formatDateYMD } from "../formatDateYMD";
describe("formatDateYMD",()=>{
    it('When date is ISO return in DD-MM-YYYY format', () => {
        const result: string = formatDateYMD('2023-04-18T07:42:26.926000+00:00');
        expect(result).toBe('2023-04-18');
      });
})

    
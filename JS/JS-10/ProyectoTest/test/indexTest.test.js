//prueba efectiva
//const indexTest = require ("../calculadora"); eqma5
import { indexTest } from "../calculadora"; //ecma6
test("test suma", () => {
    const r = indexTest.suma(3,2);
    expect (r).toBe(5);
});
test.todo("test resta");
test.todo("test multi");
test.todo("test division");
/*
test("test de suma", ( ) =>{
//second
});
 */
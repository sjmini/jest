$assert.notThrows(function () { var x  ; ( y => { x = y ; } ) `\1` ;$assert.compareArray(Object.getOwnPropertyNames(x), ["0", "length", "raw"]);$verifyProperty(x, "length", { value: 1, writable: false, enumerable: false, configurable: false});$verifyProperty(x, "0", { value: undefined, writable: false, enumerable: true, configurable: false});$assert.compareArray(Object.getOwnPropertyNames(x["raw"]), ["0", "length"]);$verifyProperty(x["raw"], "length", { value: 1, writable: false, enumerable: false, configurable: false});$verifyProperty(x["raw"], "0", { value: "", writable: false, enumerable: true, configurable: false});$verifyProperty(x, "raw", { writable: false, enumerable: false, configurable: false}); });
$assert.notThrows(function () { class A  {  }$assert.compareArray(Object.getOwnPropertyNames(A), ["length", "prototype", "name"]);$verifyProperty(A, "length", { value: 0, writable: false, enumerable: false, configurable: true});$assert.compareArray(Object.getOwnPropertyNames(A["prototype"]), ["constructor"]);$verifyProperty(A["prototype"], "constructor", { writable: true, enumerable: false, configurable: true});$verifyProperty(A, "prototype", { writable: false, enumerable: false, configurable: false});$verifyProperty(A, "name", { value: "A", writable: false, enumerable: false, configurable: true}); });
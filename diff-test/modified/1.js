$assert.notThrows(function () {
  1 != { valueOf: () => { throw 42; } }
});

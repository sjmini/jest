var x = new WeakSet ( { [ Symbol . asyncIterator ] : { [ Symbol . toPrimitive ] : '' } , [ Symbol . iterator ] : function * ( ) { ; yield { [ Symbol . toPrimitive ] : '' } ; var x = yield '' ; } } ) ;
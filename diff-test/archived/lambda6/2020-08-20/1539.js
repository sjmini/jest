var x = new WeakSet ( { [ Symbol . asyncIterator ] : null , [ Symbol . iterator ] : function * ( ) { ; yield * x ( ) ; yield 42 ; } } ) ;
var x = new WeakSet ( { [ Symbol . asyncIterator ] : function ( x ) { ; } , [ Symbol . iterator ] : function * ( x ) { ; yield * x ( ) ; yield 42 ; } } ) ;
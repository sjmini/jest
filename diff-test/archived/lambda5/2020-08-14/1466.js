var x = { [ Symbol . asyncIterator ] : true , [ Symbol . iterator ] : function * ( ) { ; yield 42 ; } } ; ( [ , x ] = x ) ;
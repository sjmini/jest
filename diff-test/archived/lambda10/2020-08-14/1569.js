for ( x of { [ Symbol . asyncIterator ] : ( ) => { throw '' ; } , [ Symbol . iterator ] : function * ( ) { ; yield * x ( ) ; } } ) ;
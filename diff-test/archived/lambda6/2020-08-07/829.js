var x = Promise . race ( { [ Symbol . asyncIterator ] : ( ) => { throw '' ; } , [ Symbol . iterator ] : function * ( ) { } } ) ;
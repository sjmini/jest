for ( x of { [ Symbol . asyncIterator ] : ( ) => { throw '' ; for ( var { } = x ; ; ) ; } , [ Symbol . iterator ] : function * ( ) { ; yield * '' ; yield 42 ; } } ) ;
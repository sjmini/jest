for ( let x of { [ Symbol . asyncIterator ] : ( ) => { throw '' ; } , [ Symbol . iterator ] : async function ( x ) { } } ) ;
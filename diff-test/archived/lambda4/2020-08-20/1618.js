var x = String . prototype . normalize . call ( new String ( 0 ) , { [ "valueOf" ] : async function ( ) { } , [ "toString" ] : function * ( x ) { } } ) ;
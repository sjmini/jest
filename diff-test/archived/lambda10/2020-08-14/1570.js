var x = Object . prototype . propertyIsEnumerable . call ( new Object ( ) , { [ Symbol . toPrimitive ] : ( ) => { throw '' ; } } ) ;
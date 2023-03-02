# Roman To Integer

- "I" can be placed before "V" (5) and "X" (10) to make 4 and 9. 			-> IV = 4 	// IX = 9
- "X" can be placed before "L" (50) and "C" (100) to make 40 and 90. 		-> XL = 40 	// XC = 90
- "C" can be placed before "D" (500) and "M" (1000) to make 400 and 900. 	-> CD = 400 // CM = 900

		substract
		I -> V,X
		X -> L,C
		C -> D,M

- Example 1:

    LVIII L = 50
    VIII  = 8

MCMXCIV 	

MC = 900
M  = 1000
XC=90
IV = 4

		accumlate -> 1994

III		"III" = 3

15 max letters // ('I', 'V', 'X', 'L', 'C', 'D', 'M') // [1, 3999]

    Values
    'I' = 1
    'V' = 5
    'X' = 10
    'L' = 50
    'C' = 100
    'D' = 500
    'M' = 1000
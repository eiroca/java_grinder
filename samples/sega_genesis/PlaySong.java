
public class PlaySong
{
  public static byte[] z80_code =
  {

      49,    0,   32,  -35,   33,   24,    1,   14,
      48,    6,   28,  -51,    2,    1,  -51,    2,
       1,  -51,    2,    1,   12,  -35,   35,   16,
     -14,   62,  -76,   50,    0,   64,   62,  -64,
      50,    1,   64,   62,  -75,   50,    0,   64,
      62,  -64,   50,    1,   64,   62,  -74,   50,
       0,   64,   62,  -64,   50,    1,   64,   62,
     -76,   50,    2,   64,   62,  -64,   50,    3,
      64,   62,  -75,   50,    2,   64,   62,  -64,
      50,    3,   64,   62,  -74,   50,    2,   64,
      62,  -64,   50,    3,   64,   22,    0,   -3,
      33, -100,    2,   -3,  110,    0,   -3,  102,
       1,  124,  -75,  -54,   -1,    0,  126,   35,
      -2,    0,  -54,  123,    0,   22,   50,    6,
     -56,   16,   -2,   21,  -62,  111,    0,   61,
     -61,  104,    0,  126,   35,   -2,   -1,  -54,
      -8,    0,   71,   94,   35,  -35,   33,   52,
       1,  -35,   25,  -35,   25,   -2,    3,  -46,
     -60,    0,   79,   62,   40,   50,    0,   64,
      62,    0, -128,   50,    1,   64,   62,  -92,
    -127,   50,    0,   64,  -35,  126,    1,   50,
       1,   64,   62,  -96, -127,   50,    0,   64,
     -35,  126,    0,   50,    1,   64,   62,   40,
      50,    0,   64,   62,  -16, -128,   50,    1,
      64,  -61,  102,    0,  -42,    3,   79,   62,
      40,   50,    0,   64,   62,    0, -128,   50,
       1,   64,   62,  -92, -127,   50,    2,   64,
     -35,  126,    1,   50,    3,   64,   62,  -96,
    -127,   50,    2,   64,  -35,  126,    0,   50,
       3,   64,   62,   40,   50,    0,   64,   62,
     -16, -128,   50,    1,   64,  -61,  102,    0,
      -3,   35,   -3,   35,  -61,   91,    0,  -61,
      -1,    0,  121,   50,    0,   64,  -35,  126,
       0,   50,    1,   64,  121,   50,    2,   64,
     -35,  126,    0,   50,    3,   64,   12,  -55,
     113,   13,   51,    1,   35,   45,   38,    0,
      95, -103,   95, -108,    5,    5,    5,    7,
       2,    2,    2,    2,   17,   17,   17,  -90,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,    0,    0,    0,    0,
       0,    0,    0,    0,  105,    2, -115,    2,
     -76,    2,  -35,    2,    9,    3,   55,    3,
     104,    3, -100,    3,  -45,    3,   13,    4,
      75,    4, -116,    4,  105,   10, -115,   10,
     -76,   10,  -35,   10,    9,   11,   55,   11,
     104,   11, -100,   11,  -45,   11,   13,   12,
      75,   12, -116,   12,  105,   18, -115,   18,
     -76,   18,  -35,   18,    9,   19,   55,   19,
     104,   19, -100,   19,  -45,   19,   13,   20,
      75,   20, -116,   20,  105,   26, -115,   26,
     -76,   26,  -35,   26,    9,   27,   55,   27,
     104,   27, -100,   27,  -45,   27,   13,   28,
      75,   28, -116,   28,  105,   34, -115,   34,
     -76,   34,  -35,   34,    9,   35,   55,   35,
     104,   35, -100,   35,  -45,   35,   13,   36,
      75,   36, -116,   36,  105,   42, -115,   42,
     -76,   42,  -35,   42,    9,   43,   55,   43,
     104,   43, -100,   43,  -45,   43,   13,   44,
      75,   44, -116,   44,  105,   50, -115,   50,
     -76,   50,  -35,   50,    9,   51,   55,   51,
     104,   51, -100,   51,  -45,   51,   13,   52,
      75,   52, -116,   52,  105,   58, -115,   58,
     -76,   58,  -35,   58,    9,   59,   55,   59,
     104,   59, -100,   59,  -45,   59,   13,   60,
      75,   60, -116,   60,  105,   66, -115,   66,
     -76,   66,  -35,   66,    9,   67,   55,   67,
     104,   67, -100,   67,  -45,   67,   13,   68,
      75,   68, -116,   68,    0,    0,   81,    0,
       1,   84,    0,    2,   88,   96,    0,   84,
       0,    1,   88,    0,    2,   91,   96,   -1,
      -1,    0,    0,   93,    0,    1,   96,    0,
       2,  100,  -64,   -1,   -1,    0,    0,   89,
       0,    1,   81,    0,    2,   84,   48,    0,
      89,    0,    1,   81,    0,    2,   86,   48,
       0,   89,    0,    1,   81,    0,    2,   88,
      48,    0,   89,    0,    1,   80,    0,    2,
      89,   48,   -1,   -1,  117,    2,  117,    2,
     117,    2,  117,    2,   84,    2,   84,    2,
      84,    2,   84,    2,  105,    2,  105,    2,
     105,    2,  105,    2,    0,    0,
  };
}


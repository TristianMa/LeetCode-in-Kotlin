package g0001_0100.s0006_zigzag_conversion

// #Medium #String #2022_03_22_Time_351_ms_(78.99%)_Space_40_MB_(84.02%)

class Solution {
    fun convert(s: String, numRows: Int): String {
        val sLen = s.length
        if (numRows == 1) {
            return s
        }
        val maxDist = numRows * 2 - 2
        val buf = StringBuilder()
        for (i in 0 until numRows) {
            var index = i
            if (i == 0 || i == numRows - 1) {
                while (index < sLen) {
                    buf.append(s[index])
                    index += maxDist
                }
            } else {
                while (index < sLen) {
                    buf.append(s[index])
                    index += maxDist - i * 2
                    if (index >= sLen) {
                        break
                    }
                    buf.append(s[index])
                    index += i * 2
                }
            }
        }
        return buf.toString()
    }
}

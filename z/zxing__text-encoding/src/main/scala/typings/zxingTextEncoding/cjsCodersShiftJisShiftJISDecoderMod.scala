package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.cjsCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCodersShiftJisShiftJISDecoderMod {
  
  @JSImport("@zxing/text-encoding/cjs/coders/shift-jis/ShiftJISDecoder", "ShiftJISDecoder")
  @js.native
  open class ShiftJISDecoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    var Shift_JIS_lead: Double = js.native
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream The stream of bytes being decoded.
      * @param {number} bite The next byte read from the stream.
      * @return {?(number|!Array.<number>)} The next code point(s)
      *     decoded, or null if not enough data exists in the input
      *     stream to decode a complete code point.
      */
    def handler(stream: Stream, bite: Double): Double | js.Array[Double] | Null = js.native
  }
}

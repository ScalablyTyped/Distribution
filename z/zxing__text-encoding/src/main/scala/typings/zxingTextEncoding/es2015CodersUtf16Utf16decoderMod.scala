package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersUtf16Utf16decoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/utf-16/UTF16Decoder", "UTF16Decoder")
  @js.native
  open class UTF16Decoder protected () extends StObject {
    def this(utf16_be: Boolean, options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream The stream of bytes being decoded.
      * @param {number} bite The next byte read from the stream.
      * @return {?(number|!Array.<number>)} The next code point(s)
      *     decoded, or null if not enough data exists in the input
      *     stream to decode a complete code point.
      */
    def handler(stream: Stream, bite: Double): Double | js.Array[Double] | Null = js.native
    
    /* private */ var utf16_be: Any = js.native
    
    var utf16_lead_byte: Any = js.native
    
    var utf16_lead_surrogate: Any = js.native
  }
}

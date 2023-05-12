package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.cjsCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCodersUtf8Utf8decoderMod {
  
  @JSImport("@zxing/text-encoding/cjs/coders/utf-8/UTF8Decoder", "UTF8Decoder")
  @js.native
  open class UTF8Decoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream The stream of bytes being decoded.
      * @param {number} bite The next byte read from the stream.
      * @return {?(number|!Array.<number>)} The next code point(s)
      *     decoded, or null if not enough data exists in the input
      *     stream to decode a complete code point.
      */
    def handler(stream: Stream, bite: Double): Double | js.Array[Double] | Null = js.native
    
    var utf8_bytes_needed: Double = js.native
    
    var utf8_bytes_seen: Double = js.native
    
    var utf8_code_point: Double = js.native
    
    var utf8_lower_boundary: Double = js.native
    
    var utf8_upper_boundary: Double = js.native
  }
}

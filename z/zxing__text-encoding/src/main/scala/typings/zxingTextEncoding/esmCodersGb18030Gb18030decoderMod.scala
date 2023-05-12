package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.esmCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersGb18030Gb18030decoderMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/gb18030/GB18030Decoder", "GB18030Decoder")
  @js.native
  open class GB18030Decoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    var gb18030_first: Double = js.native
    
    var gb18030_second: Double = js.native
    
    var gb18030_third: Double = js.native
    
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

package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.cjsCommonMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCodersEucJpEucjpdecoderMod {
  
  @JSImport("@zxing/text-encoding/cjs/coders/euc-jp/EUCJPDecoder", "EUCJPDecoder")
  @js.native
  open class EUCJPDecoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    var eucjp_jis0212_flag: Boolean = js.native
    
    var eucjp_lead: Double = js.native
    
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

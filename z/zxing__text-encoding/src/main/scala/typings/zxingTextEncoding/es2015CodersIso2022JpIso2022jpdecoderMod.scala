package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersIso2022JpIso2022jpdecoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/iso-2022-jp/ISO2022JPDecoder", "ISO2022JPDecoder")
  @js.native
  open class ISO2022JPDecoder protected () extends StObject {
    /**
      * @constructor
      * @implements {Decoder}
      * @param {{fatal: boolean}} options
      */
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
    
    var iso2022jp_decoder_output_state: Any = js.native
    
    var iso2022jp_decoder_state: Any = js.native
    
    var iso2022jp_lead: Double = js.native
    
    var iso2022jp_output_flag: Boolean = js.native
  }
}

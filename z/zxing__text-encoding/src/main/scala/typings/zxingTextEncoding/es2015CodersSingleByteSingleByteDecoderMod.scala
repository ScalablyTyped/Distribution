package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.es2015CommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CodersSingleByteSingleByteDecoderMod {
  
  @JSImport("@zxing/text-encoding/es2015/coders/single-byte/SingleByteDecoder", "SingleByteDecoder")
  @js.native
  open class SingleByteDecoder protected () extends StObject {
    def this(index: js.Array[Double], options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream The stream of bytes being decoded.
      * @param {number} bite The next byte read from the stream.
      * @return {?(number|!Array.<number>)} The next code point(s)
      *     decoded, or null if not enough data exists in the input
      *     stream to decode a complete code point.
      */
    def handler(stream: Stream, bite: Double): Double | js.Array[Double] | Null = js.native
    
    /* private */ val index: Any = js.native
  }
}

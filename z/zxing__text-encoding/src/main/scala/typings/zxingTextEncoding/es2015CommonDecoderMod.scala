package typings.zxingTextEncoding

import typings.zxingTextEncoding.es2015CommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015CommonDecoderMod {
  
  trait Decoder extends StObject {
    
    /**
      * @param {Stream} stream The stream of bytes being decoded.
      * @param {number} bite The next byte read from the stream.
      * @return {?(number|!Array.<number>)} The next code point(s)
      *     decoded, or null if not enough data exists in the input
      *     stream to decode a complete code point, or |finished|.
      */
    def handler(stream: Stream, bite: Double): Double | js.Array[Double]
  }
  object Decoder {
    
    inline def apply(handler: (Stream, Double) => Double | js.Array[Double]): Decoder = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler))
      __obj.asInstanceOf[Decoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decoder] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: (Stream, Double) => Double | js.Array[Double]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    }
  }
}

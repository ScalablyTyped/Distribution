package typings.zxingTextEncoding

import typings.zxingTextEncoding.esmCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCommonEncoderMod {
  
  trait Encoder extends StObject {
    
    /**
      * @param {Stream} stream The stream of code points being encoded.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit, or |finished|.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double]
  }
  object Encoder {
    
    inline def apply(handler: (Stream, Double) => Double | js.Array[Double]): Encoder = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler))
      __obj.asInstanceOf[Encoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoder] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: (Stream, Double) => Double | js.Array[Double]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    }
  }
}

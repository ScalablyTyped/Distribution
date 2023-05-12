package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import typings.zxingTextEncoding.esmCommonStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersIso2022JpIso2022jpencoderMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/iso-2022-jp/ISO2022JPEncoder", "ISO2022JPEncoder")
  @js.native
  open class ISO2022JPEncoder protected () extends StObject {
    def this(options: Fatal) = this()
    
    val fatal: Boolean = js.native
    
    /**
      * @param {Stream} stream Input stream.
      * @param {number} code_point Next code point read from the stream.
      * @return {(number|!Array.<number>)} Byte(s) to emit.
      */
    def handler(stream: Stream, code_point: Double): Double | js.Array[Double] = js.native
    
    var iso2022jp_state: states = js.native
  }
  
  @js.native
  sealed trait states extends StObject
  @JSImport("@zxing/text-encoding/esm/coders/iso-2022-jp/ISO2022JPEncoder", "states")
  @js.native
  object states extends StObject {
    
    @js.native
    sealed trait ASCII
      extends StObject
         with states
    
    @js.native
    sealed trait Roman
      extends StObject
         with states
    
    @js.native
    sealed trait jis0208
      extends StObject
         with states
  }
}

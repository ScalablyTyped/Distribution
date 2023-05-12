package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersIso2022JpMod {
  
  @JSImport("@zxing/text-encoding/esm/coders/iso-2022-jp", "ISO2022JPDecoder")
  @js.native
  open class ISO2022JPDecoder protected ()
    extends typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpdecoderMod.ISO2022JPDecoder {
    /**
      * @constructor
      * @implements {Decoder}
      * @param {{fatal: boolean}} options
      */
    def this(options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/coders/iso-2022-jp", "ISO2022JPEncoder")
  @js.native
  open class ISO2022JPEncoder protected ()
    extends typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpencoderMod.ISO2022JPEncoder {
    def this(options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/coders/iso-2022-jp", "states")
  @js.native
  object states extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpencoderMod.states & Double] = js.native
    
    /* 0 */ val ASCII: typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpencoderMod.states.ASCII & Double = js.native
    
    /* 1 */ val Roman: typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpencoderMod.states.Roman & Double = js.native
    
    /* 2 */ val jis0208: typings.zxingTextEncoding.esmCodersIso2022JpIso2022jpencoderMod.states.jis0208 & Double = js.native
  }
}

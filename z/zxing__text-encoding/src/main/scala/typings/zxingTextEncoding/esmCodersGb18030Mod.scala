package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCodersGb18030Mod {
  
  @JSImport("@zxing/text-encoding/esm/coders/gb18030", "GB18030Decoder")
  @js.native
  open class GB18030Decoder protected ()
    extends typings.zxingTextEncoding.esmCodersGb18030Gb18030decoderMod.GB18030Decoder {
    def this(options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/esm/coders/gb18030", "GB18030Encoder")
  @js.native
  open class GB18030Encoder protected ()
    extends typings.zxingTextEncoding.esmCodersGb18030Gb18030encoderMod.GB18030Encoder {
    def this(options: Fatal) = this()
    def this(options: Fatal, gbk_flag: Boolean) = this()
  }
}

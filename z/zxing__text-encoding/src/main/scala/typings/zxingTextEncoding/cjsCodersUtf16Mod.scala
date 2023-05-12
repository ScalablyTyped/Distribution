package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCodersUtf16Mod {
  
  @JSImport("@zxing/text-encoding/cjs/coders/utf-16", "UTF16Decoder")
  @js.native
  open class UTF16Decoder protected ()
    extends typings.zxingTextEncoding.cjsCodersUtf16Utf16decoderMod.UTF16Decoder {
    def this(utf16_be: Boolean, options: Fatal) = this()
  }
  
  @JSImport("@zxing/text-encoding/cjs/coders/utf-16", "UTF16Encoder")
  @js.native
  open class UTF16Encoder protected ()
    extends typings.zxingTextEncoding.cjsCodersUtf16Utf16encoderMod.UTF16Encoder {
    def this(utf16_be: Boolean, options: Fatal) = this()
  }
}

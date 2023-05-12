package typings.zxingTextEncoding

import org.scalablytyped.runtime.StringDictionary
import typings.zxingTextEncoding.anon.FatalAny
import typings.zxingTextEncoding.es2015CommonDecoderMod.Decoder
import typings.zxingTextEncoding.es2015CommonEncoderMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015EncodingEncodingFactoryMod {
  
  @JSImport("@zxing/text-encoding/es2015/encoding/encoding-factory", "decoders")
  @js.native
  val decoders: Decoders_ = js.native
  
  @JSImport("@zxing/text-encoding/es2015/encoding/encoding-factory", "encoders")
  @js.native
  val encoders: Encoders_ = js.native
  
  type Decoders_ = StringDictionary[XCoderFactory[Decoder]]
  
  type Encoders_ = StringDictionary[XCoderFactory[Encoder]]
  
  type XCoderFactory[Tncoder] = js.Function1[/* param0 */ FatalAny, Tncoder]
}

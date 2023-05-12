package typings.zxingTextEncoding

import typings.zxingTextEncoding.anon.Encodings
import typings.zxingTextEncoding.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015EncodingEncodingsMod {
  
  @JSImport("@zxing/text-encoding/es2015/encoding/encodings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decoderError(fatal: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decoderError")(fatal.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def decoderError(fatal: Boolean, opt_code_point: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decoderError")(fatal.asInstanceOf[js.Any], opt_code_point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encoderError(code_point: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encoderError")(code_point.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Encodings table: https://encoding.spec.whatwg.org/encodings.json
    * @const
    * @type {!Array.<{
    *          heading: string,
    *          encodings: Array.<{name:string,labels:Array.<string>}>
    *        }>}
    */
  @JSImport("@zxing/text-encoding/es2015/encoding/encodings", "encodings")
  @js.native
  val encodings: js.Array[Encodings] = js.native
  
  inline def getEncoding(label: String): Labels | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(label.asInstanceOf[js.Any]).asInstanceOf[Labels | Null]
}

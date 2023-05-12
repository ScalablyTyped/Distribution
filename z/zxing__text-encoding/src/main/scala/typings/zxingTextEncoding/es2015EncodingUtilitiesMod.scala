package typings.zxingTextEncoding

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015EncodingUtilitiesMod {
  
  @JSImport("@zxing/text-encoding/es2015/encoding/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ToDictionary(o: Any): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDictionary")(o.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def codePointsToString(code_points: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codePointsToString")(code_points.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inRange(a: Double, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def includes(array: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stringToCodePoints(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToCodePoints")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}

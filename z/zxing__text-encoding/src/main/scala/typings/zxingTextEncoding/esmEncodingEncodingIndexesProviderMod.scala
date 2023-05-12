package typings.zxingTextEncoding

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEncodingEncodingIndexesProviderMod {
  
  @JSImport("@zxing/text-encoding/esm/encoding/encoding-indexes-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEncodingIndexes(): EncodingIndexMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingIndexes")().asInstanceOf[EncodingIndexMap]
  
  type EncodingIndexMap = StringDictionary[js.Array[Double]]
}

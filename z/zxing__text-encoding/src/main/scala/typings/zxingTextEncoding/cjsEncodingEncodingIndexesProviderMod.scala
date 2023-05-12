package typings.zxingTextEncoding

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsEncodingEncodingIndexesProviderMod {
  
  @JSImport("@zxing/text-encoding/cjs/encoding/encoding-indexes-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEncodingIndexes(): EncodingIndexMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingIndexes")().asInstanceOf[EncodingIndexMap]
  
  type EncodingIndexMap = StringDictionary[js.Array[Double]]
}

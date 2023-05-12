package typings.zxingTextEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmEncodingIndexesMod_ {
  
  @JSImport("@zxing/text-encoding/esm/encoding/indexes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def index(name: String): js.Array[js.Array[Double] | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double] | Double]]
  
  inline def indexBig5PointerFor(code_point: Double): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("indexBig5PointerFor")(code_point.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def indexCodePointFor(pointer: Double): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("indexCodePointFor")(pointer.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def indexCodePointFor(pointer: Double, index: js.Array[Double | Null]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("indexCodePointFor")(pointer.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def indexGB18030RangesCodePointFor(pointer: Double): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("indexGB18030RangesCodePointFor")(pointer.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def indexGB18030RangesPointerFor(code_point: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexGB18030RangesPointerFor")(code_point.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def indexPointerFor(code_point: Double, index: js.Array[Double | Null]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("indexPointerFor")(code_point.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def indexShiftJISPointerFor(code_point: Double): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("indexShiftJISPointerFor")(code_point.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
}

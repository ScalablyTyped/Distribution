package typings.zxcvbn

import typings.zxcvbn.mod.ZXCVBNResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def zxcvbn(password: String): ZXCVBNResult = js.Dynamic.global.applyDynamic("zxcvbn")(password.asInstanceOf[js.Any]).asInstanceOf[ZXCVBNResult]
  inline def zxcvbn(password: String, userInputs: js.Array[String]): ZXCVBNResult = (js.Dynamic.global.applyDynamic("zxcvbn")(password.asInstanceOf[js.Any], userInputs.asInstanceOf[js.Any])).asInstanceOf[ZXCVBNResult]
}

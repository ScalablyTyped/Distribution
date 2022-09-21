package typings.zapierSecretScrubber

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@zapier/secret-scrubber/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64(`val`: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def censor(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isLongEnoughToBeSecret(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLongEnoughToBeSecret")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeSensitiveBank(secretValues: js.Array[String | Double]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSensitiveBank")(secretValues.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def recurseExtract(obj: js.Array[Any], matcher: js.Function2[/* key */ String, /* value */ Any, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurseExtract")(obj.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def recurseExtract(obj: js.Object, matcher: js.Function2[/* key */ String, /* value */ Any, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("recurseExtract")(obj.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def recurseReplace(obj: Any, replacer: js.Function1[/* val */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("recurseReplace")(obj.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def replaceAll(baseString: String, searchString: String, replaceValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(baseString.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.zapierSecretScrubber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convenienceMod {
  
  @JSImport("@zapier/secret-scrubber/lib/convenience", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@zapier/secret-scrubber/lib/convenience", "SENSITIVE_SUBSTRINGS")
  @js.native
  val SENSITIVE_SUBSTRINGS: js.Array[String] = js.native
  
  inline def extractSecretsFromUrl(maybeUrlStr: String): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSecretsFromUrl")(maybeUrlStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  
  inline def isSensitiveKey(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSensitiveKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUrlWithSecrets(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlWithSecrets")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

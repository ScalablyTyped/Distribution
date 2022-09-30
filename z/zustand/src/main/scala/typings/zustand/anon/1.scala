package typings.zustand.anon

import typings.immer.typesExternalMod.Draft
import typings.std.Partial
import typings.zustand.immerMod.SkipTwo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  def setState(
    nextStateOrUpdater: js.Function1[/* state */ Draft[Any], Unit],
    shouldReplace: Boolean,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
  def setState(
    nextStateOrUpdater: js.Function1[/* state */ Draft[Any], Unit],
    shouldReplace: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
  def setState(
    nextStateOrUpdater: Any,
    shouldReplace: Boolean,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
  def setState(
    nextStateOrUpdater: Any,
    shouldReplace: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
  def setState(
    nextStateOrUpdater: Partial[Any],
    shouldReplace: Boolean,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
  def setState(
    nextStateOrUpdater: Partial[Any],
    shouldReplace: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param a because its type SkipTwo<A> is not an array type */ a: SkipTwo[Any]
  ): Any = js.native
}

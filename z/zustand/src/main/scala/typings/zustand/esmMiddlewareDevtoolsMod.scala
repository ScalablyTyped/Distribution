package typings.zustand

import org.scalablytyped.runtime.StringDictionary
import typings.std.Omit
import typings.zustand.anon.Dispatch
import typings.zustand.anon.Immutable
import typings.zustand.esmVanillaMod.StateCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMiddlewareDevtoolsMod {
  
  @JSImport("zustand/esm/middleware/devtools", "devtools")
  @js.native
  val devtools: Devtools_ = js.native
  
  trait Action[T] extends StObject {
    
    var `type`: T
  }
  object Action {
    
    inline def apply[T](`type`: T): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action[?], T] (val x: Self & Action[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionCreator[A, P /* <: js.Array[Any] */] = js.Function1[/* args */ P, A]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends U ? T : U
    }}}
    */
  type Cast[T, U] = T
  
  trait Config
    extends StObject
       with EnhancerOptions {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DevtoolsOptions
    extends StObject
       with Config {
    
    var anonymousActionType: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[String] = js.undefined
  }
  object DevtoolsOptions {
    
    inline def apply(): DevtoolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevtoolsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DevtoolsOptions] (val x: Self) extends AnyVal {
      
      inline def setAnonymousActionType(value: String): Self = StObject.set(x, "anonymousActionType", value.asInstanceOf[js.Any])
      
      inline def setAnonymousActionTypeUndefined: Self = StObject.set(x, "anonymousActionType", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  type Devtools_ = js.Function2[
    /* initializer */ StateCreator[
      Any, 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      js.Array[Any], 
      Any
    ], 
    /* devtoolsOptions */ js.UndefOr[DevtoolsOptions], 
    StateCreator[
      Any, 
      js.Array[Any], 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      Any
    ]
  ]
  
  trait EnhancerOptions extends StObject {
    
    var actionCreators: js.UndefOr[
        (js.Array[ActionCreator[Any, js.Array[Any]]]) | (StringDictionary[ActionCreator[Any, js.Array[Any]]])
      ] = js.undefined
    
    var actionSanitizer: js.UndefOr[js.Function2[/* action */ Action[Any], /* id */ Double, Action[Any]]] = js.undefined
    
    var actionsAllowlist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var actionsBlacklist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var actionsDenylist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var actionsWhitelist: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var autoPause: js.UndefOr[Boolean] = js.undefined
    
    var features: js.UndefOr[Dispatch] = js.undefined
    
    var latency: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pauseActionType: js.UndefOr[String] = js.undefined
    
    var predicate: js.UndefOr[js.Function2[/* state */ Any, /* action */ Action[Any], Boolean]] = js.undefined
    
    var serialize: js.UndefOr[Boolean | Immutable] = js.undefined
    
    var shouldCatchErrors: js.UndefOr[Boolean] = js.undefined
    
    var shouldHotReload: js.UndefOr[Boolean] = js.undefined
    
    var shouldRecordChanges: js.UndefOr[Boolean] = js.undefined
    
    var shouldStartLocked: js.UndefOr[Boolean] = js.undefined
    
    var stateSanitizer: js.UndefOr[js.Function2[/* state */ Any, /* index */ Double, Any]] = js.undefined
    
    var trace: js.UndefOr[Boolean | (js.Function1[/* action */ Action[Any], String])] = js.undefined
    
    var traceLimit: js.UndefOr[Double] = js.undefined
  }
  object EnhancerOptions {
    
    inline def apply(): EnhancerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnhancerOptions] (val x: Self) extends AnyVal {
      
      inline def setActionCreators(
        value: (js.Array[ActionCreator[Any, js.Array[Any]]]) | (StringDictionary[ActionCreator[Any, js.Array[Any]]])
      ): Self = StObject.set(x, "actionCreators", value.asInstanceOf[js.Any])
      
      inline def setActionCreatorsUndefined: Self = StObject.set(x, "actionCreators", js.undefined)
      
      inline def setActionCreatorsVarargs(value: (ActionCreator[Any, js.Array[Any]])*): Self = StObject.set(x, "actionCreators", js.Array(value*))
      
      inline def setActionSanitizer(value: (/* action */ Action[Any], /* id */ Double) => Action[Any]): Self = StObject.set(x, "actionSanitizer", js.Any.fromFunction2(value))
      
      inline def setActionSanitizerUndefined: Self = StObject.set(x, "actionSanitizer", js.undefined)
      
      inline def setActionsAllowlist(value: String | js.Array[String]): Self = StObject.set(x, "actionsAllowlist", value.asInstanceOf[js.Any])
      
      inline def setActionsAllowlistUndefined: Self = StObject.set(x, "actionsAllowlist", js.undefined)
      
      inline def setActionsAllowlistVarargs(value: String*): Self = StObject.set(x, "actionsAllowlist", js.Array(value*))
      
      inline def setActionsBlacklist(value: String | js.Array[String]): Self = StObject.set(x, "actionsBlacklist", value.asInstanceOf[js.Any])
      
      inline def setActionsBlacklistUndefined: Self = StObject.set(x, "actionsBlacklist", js.undefined)
      
      inline def setActionsBlacklistVarargs(value: String*): Self = StObject.set(x, "actionsBlacklist", js.Array(value*))
      
      inline def setActionsDenylist(value: String | js.Array[String]): Self = StObject.set(x, "actionsDenylist", value.asInstanceOf[js.Any])
      
      inline def setActionsDenylistUndefined: Self = StObject.set(x, "actionsDenylist", js.undefined)
      
      inline def setActionsDenylistVarargs(value: String*): Self = StObject.set(x, "actionsDenylist", js.Array(value*))
      
      inline def setActionsWhitelist(value: String | js.Array[String]): Self = StObject.set(x, "actionsWhitelist", value.asInstanceOf[js.Any])
      
      inline def setActionsWhitelistUndefined: Self = StObject.set(x, "actionsWhitelist", js.undefined)
      
      inline def setActionsWhitelistVarargs(value: String*): Self = StObject.set(x, "actionsWhitelist", js.Array(value*))
      
      inline def setAutoPause(value: Boolean): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
      
      inline def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
      
      inline def setFeatures(value: Dispatch): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPauseActionType(value: String): Self = StObject.set(x, "pauseActionType", value.asInstanceOf[js.Any])
      
      inline def setPauseActionTypeUndefined: Self = StObject.set(x, "pauseActionType", js.undefined)
      
      inline def setPredicate(value: (/* state */ Any, /* action */ Action[Any]) => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction2(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setSerialize(value: Boolean | Immutable): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setShouldCatchErrors(value: Boolean): Self = StObject.set(x, "shouldCatchErrors", value.asInstanceOf[js.Any])
      
      inline def setShouldCatchErrorsUndefined: Self = StObject.set(x, "shouldCatchErrors", js.undefined)
      
      inline def setShouldHotReload(value: Boolean): Self = StObject.set(x, "shouldHotReload", value.asInstanceOf[js.Any])
      
      inline def setShouldHotReloadUndefined: Self = StObject.set(x, "shouldHotReload", js.undefined)
      
      inline def setShouldRecordChanges(value: Boolean): Self = StObject.set(x, "shouldRecordChanges", value.asInstanceOf[js.Any])
      
      inline def setShouldRecordChangesUndefined: Self = StObject.set(x, "shouldRecordChanges", js.undefined)
      
      inline def setShouldStartLocked(value: Boolean): Self = StObject.set(x, "shouldStartLocked", value.asInstanceOf[js.Any])
      
      inline def setShouldStartLockedUndefined: Self = StObject.set(x, "shouldStartLocked", js.undefined)
      
      inline def setStateSanitizer(value: (/* state */ Any, /* index */ Double) => Any): Self = StObject.set(x, "stateSanitizer", js.Any.fromFunction2(value))
      
      inline def setStateSanitizerUndefined: Self = StObject.set(x, "stateSanitizer", js.undefined)
      
      inline def setTrace(value: Boolean | (js.Function1[/* action */ Action[Any], String])): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceFunction1(value: /* action */ Action[Any] => String): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceLimit(value: Double): Self = StObject.set(x, "traceLimit", value.asInstanceOf[js.Any])
      
      inline def setTraceLimitUndefined: Self = StObject.set(x, "traceLimit", js.undefined)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  type NamedSet[T] = /* import warning: importer.ImportType#apply Failed type conversion: zustand.zustand/esm/middleware/devtools.WithDevtools<zustand.zustand/esm/vanilla.StoreApi<T>>['setState'] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends {setState (a : infer Sa): infer Sr} ? {setState <A extends string | {  type :unknown}>(a : [a: ...zustand.zustand/esm/middleware/devtools.TakeTwo<Sa>, action: A | undefined]): Sr} : never
    }}}
    */
  @js.native
  trait StoreDevtools[S] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {  length :0} ? [undefined, undefined] : T extends {  length :1} ? [a0: ...zustand.zustand/esm/middleware/devtools.Cast<T, std.Array<unknown>>, a1: undefined] : T extends {  length :0 | 1} ? [a0: ...zustand.zustand/esm/middleware/devtools.Cast<T, std.Array<unknown>>, a1: undefined] : T extends {  length :2} ? T : T extends {  length :1 | 2} ? T : T extends {  length :0 | 1 | 2} ? T : T extends [infer A0, infer A1, ...std.Array<unknown>] ? [A0, A1] : T extends [infer A0, infer A1 | undefined, ...std.Array<unknown>] ? [A0, A1 | undefined] : T extends [infer A0 | undefined, infer A1 | undefined, ...std.Array<unknown>] ? [A0 | undefined, A1 | undefined] : never
    }}}
    */
  type TakeTwo[T] = js.Tuple2[Unit, Unit]
  
  type WithDevtools[S] = Write[S, StoreDevtools[S]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandEsmVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/devtools")
      var zustandSlashdevtools: WithDevtools[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashdevtools: WithDevtools[S]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/devtools")(zustandSlashdevtools.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StoreMutators[?, ?], S, A] (val x: Self & (StoreMutators[S, A])) extends AnyVal {
        
        inline def setZustandSlashdevtools(value: WithDevtools[S]): Self = StObject.set(x, "zustand/devtools", value.asInstanceOf[js.Any])
      }
    }
  }
}

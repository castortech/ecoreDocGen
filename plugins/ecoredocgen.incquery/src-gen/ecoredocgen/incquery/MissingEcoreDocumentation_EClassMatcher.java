package ecoredocgen.incquery;

import ecoredocgen.incquery.MissingEcoreDocumentation_EClassMatch;
import ecoredocgen.incquery.util.MissingEcoreDocumentation_EClassQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the ecoredocgen.incquery.missingEcoreDocumentation_EClass pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MissingEcoreDocumentation_EClassMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern missingEcoreDocumentation_EClass(host:EClass)
 * {
 * 	find missingEcoreDocumentation(host);
 * }
 * </pre></code>
 * 
 * @see MissingEcoreDocumentation_EClassMatch
 * @see MissingEcoreDocumentation_EClassProcessor
 * @see MissingEcoreDocumentation_EClassQuerySpecification
 * 
 */
public class MissingEcoreDocumentation_EClassMatcher extends BaseMatcher<MissingEcoreDocumentation_EClassMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MissingEcoreDocumentation_EClassMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MissingEcoreDocumentation_EClassMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MissingEcoreDocumentation_EClassMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_HOST = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public MissingEcoreDocumentation_EClassMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public MissingEcoreDocumentation_EClassMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return matches represented as a MissingEcoreDocumentation_EClassMatch object.
   * 
   */
  public Collection<MissingEcoreDocumentation_EClassMatch> getAllMatches(final EClass pHost) {
    return rawGetAllMatches(new Object[]{pHost});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return a match represented as a MissingEcoreDocumentation_EClassMatch object, or null if no match is found.
   * 
   */
  public MissingEcoreDocumentation_EClassMatch getOneArbitraryMatch(final EClass pHost) {
    return rawGetOneArbitraryMatch(new Object[]{pHost});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pHost) {
    return rawHasMatch(new Object[]{pHost});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pHost) {
    return rawCountMatches(new Object[]{pHost});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pHost, final IMatchProcessor<? super MissingEcoreDocumentation_EClassMatch> processor) {
    rawForEachMatch(new Object[]{pHost}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pHost, final IMatchProcessor<? super MissingEcoreDocumentation_EClassMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pHost}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<MissingEcoreDocumentation_EClassMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pHost) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pHost});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pHost the fixed value of pattern parameter host, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MissingEcoreDocumentation_EClassMatch newMatch(final EClass pHost) {
    return new MissingEcoreDocumentation_EClassMatch.Immutable(pHost);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfhost(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_HOST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for host.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfhost() {
    return rawAccumulateAllValuesOfhost(emptyArray());
  }
  
  @Override
  protected MissingEcoreDocumentation_EClassMatch tupleToMatch(final Tuple t) {
    try {
    	return new MissingEcoreDocumentation_EClassMatch.Immutable((org.eclipse.emf.ecore.EClass) t.get(POSITION_HOST));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected MissingEcoreDocumentation_EClassMatch arrayToMatch(final Object[] match) {
    try {
    	return new MissingEcoreDocumentation_EClassMatch.Immutable((org.eclipse.emf.ecore.EClass) match[POSITION_HOST]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected MissingEcoreDocumentation_EClassMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new MissingEcoreDocumentation_EClassMatch.Mutable((org.eclipse.emf.ecore.EClass) match[POSITION_HOST]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<MissingEcoreDocumentation_EClassMatcher> querySpecification() throws IncQueryException {
    return MissingEcoreDocumentation_EClassQuerySpecification.instance();
  }
}

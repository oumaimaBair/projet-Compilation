/**
 */
package tpNote;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>type Graph</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tpNote.TpNotePackage#gettypeGraph()
 * @model
 * @generated
 */
public enum typeGraph implements Enumerator {
	/**
	 * The '<em><b>Bar Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_CHART(0, "BarChart", "BarChart"),

	/**
	 * The '<em><b>Area Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	AREA_CHART(1, "AreaChart", "AreaChart"),

	/**
	 * The '<em><b>Bubble Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	BUBBLE_CHART(2, "BubbleChart", "BubbleChart"),

	/**
	 * The '<em><b>Line Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_CHART(3, "LineChart", "LineChart"),

	/**
	 * The '<em><b>Scatter Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER_CHART(4, "ScatterChart", "ScatterChart"),

	/**
	 * The '<em><b>Radar Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR_CHART(5, "RadarChart", "RadarChart"),

	/**
	 * The '<em><b>Mixed Chart Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_CHART_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED_CHART_TYPES(6, "MixedChartTypes", "MixedChartTypes"),

	/**
	 * The '<em><b>Polar Area Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLAR_AREA_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	POLAR_AREA_CHART(7, "PolarAreaChart", "PolarAreaChart"),
	/**
	 * The '<em><b>Doughnut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DOUGHNUT_VALUE
	 * @generated
	 * @ordered
	 */
	DOUGHNUT(8, "Doughnut", "Doughnut"),
	/**
	 * The '<em><b>Pie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(9, "Pie", "Pie");

	/**
	 * The '<em><b>Bar Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_CHART
	 * @model name="BarChart"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_CHART_VALUE = 0;

	/**
	 * The '<em><b>Area Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_CHART
	 * @model name="AreaChart"
	 * @generated
	 * @ordered
	 */
	public static final int AREA_CHART_VALUE = 1;

	/**
	 * The '<em><b>Bubble Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_CHART
	 * @model name="BubbleChart"
	 * @generated
	 * @ordered
	 */
	public static final int BUBBLE_CHART_VALUE = 2;

	/**
	 * The '<em><b>Line Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_CHART
	 * @model name="LineChart"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_CHART_VALUE = 3;

	/**
	 * The '<em><b>Scatter Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_CHART
	 * @model name="ScatterChart"
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_CHART_VALUE = 4;

	/**
	 * The '<em><b>Radar Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_CHART
	 * @model name="RadarChart"
	 * @generated
	 * @ordered
	 */
	public static final int RADAR_CHART_VALUE = 5;

	/**
	 * The '<em><b>Mixed Chart Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_CHART_TYPES
	 * @model name="MixedChartTypes"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_CHART_TYPES_VALUE = 6;

	/**
	 * The '<em><b>Polar Area Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLAR_AREA_CHART
	 * @model name="PolarAreaChart"
	 * @generated
	 * @ordered
	 */
	public static final int POLAR_AREA_CHART_VALUE = 7;

	/**
	 * The '<em><b>Doughnut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUGHNUT
	 * @model name="Doughnut"
	 * @generated
	 * @ordered
	 */
	public static final int DOUGHNUT_VALUE = 8;

	/**
	 * The '<em><b>Pie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model name="Pie"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 9;

	/**
	 * An array of all the '<em><b>type Graph</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final typeGraph[] VALUES_ARRAY = new typeGraph[] { BAR_CHART, AREA_CHART, BUBBLE_CHART, LINE_CHART,
			SCATTER_CHART, RADAR_CHART, MIXED_CHART_TYPES, POLAR_AREA_CHART, DOUGHNUT, PIE, };

	/**
	 * A public read-only list of all the '<em><b>type Graph</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<typeGraph> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>type Graph</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typeGraph get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeGraph result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Graph</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typeGraph getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeGraph result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Graph</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static typeGraph get(int value) {
		switch (value) {
		case BAR_CHART_VALUE:
			return BAR_CHART;
		case AREA_CHART_VALUE:
			return AREA_CHART;
		case BUBBLE_CHART_VALUE:
			return BUBBLE_CHART;
		case LINE_CHART_VALUE:
			return LINE_CHART;
		case SCATTER_CHART_VALUE:
			return SCATTER_CHART;
		case RADAR_CHART_VALUE:
			return RADAR_CHART;
		case MIXED_CHART_TYPES_VALUE:
			return MIXED_CHART_TYPES;
		case POLAR_AREA_CHART_VALUE:
			return POLAR_AREA_CHART;
		case DOUGHNUT_VALUE:
			return DOUGHNUT;
		case PIE_VALUE:
			return PIE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private typeGraph(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //typeGraph

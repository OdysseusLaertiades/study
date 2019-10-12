package study.oop.middleaerth.service;

import study.oop.middleaerth.UnitInteraction;
import study.oop.middleaerth.model.Unit;

public class MiddleEarthUnitInteraction implements UnitInteraction {

    @Override
    public Unit whoIsMostPowerful(Unit... units) {
        Unit iAmMostPowerful = null;
        for (Unit unit : units) {
            if (iAmMostPowerful == null) {
                iAmMostPowerful = unit;
                continue;
            }
            if (iAmMostPowerful.getAttackPower() < unit.getAttackPower()) {
                iAmMostPowerful = unit;
            }
        }
        return iAmMostPowerful;
    }
}

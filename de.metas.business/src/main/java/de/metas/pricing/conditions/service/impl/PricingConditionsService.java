
package de.metas.pricing.conditions.service.impl;

import de.metas.pricing.conditions.service.CalculatePricingConditionsRequest;
import de.metas.pricing.conditions.service.IPricingConditionsService;
import de.metas.pricing.conditions.service.PricingConditionsResult;
import lombok.NonNull;

public class PricingConditionsService implements IPricingConditionsService
{
	@Override
	public PricingConditionsResult calculatePricingConditions(@NonNull final CalculatePricingConditionsRequest request)
	{
		final CalculatePricingConditionsCommand command = new CalculatePricingConditionsCommand(request);
		return command.calculate();
	}
}
